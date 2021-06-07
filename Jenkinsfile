def harborUrl = "192.168.10.102:82";
def harborProject="tempsquar";
node{
    stage("拉取代码"){
checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: '6f1dcce6-38c8-448c-ab68-4d48732820b5', url: 'git@github.com:HangStarLi/cloud.git']]])
    }
    stage("安装公共子工程"){
        sh "mvn -f cloud-api-commons clean install"
    }
    stage("编译、打包"){
        sh "mvn -f ${project_name} clean package"
    }
	stage("生成镜像、打标签、推镜像到harbor"){
	    def imageName="${project_name}:latest"
	    sh"dockerfile:build"
		sh"docker tag ${iamgeName} ${harborUrl}/harborProject/${imageName}"
		withCredentials([usernamePassword(credentialsId: '0d5d3174-1003-454a-b73c-1a41a2e3d14b', passwordVariable: 'myPwd', usernameVariable: 'myUser')]) {
            sh"docker login -u myUser -p myPwd ${harborUrl}"
		    sh"docker push ${harborUrl}/${harborProject}/${iamgeName}"
			echo "推送成功"
}
	}
}