node{
    stage("拉取代码"){
checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: '6f1dcce6-38c8-448c-ab68-4d48732820b5', url: 'git@github.com:HangStarLi/cloud.git']]])
    }
    stage("安装公共子工程"){
        sh "mvn -f cloud-api-commons clean install"
    }
    stage("编译、打包"){
        sh "mvn -f ${project_name} clean package dockerfile:build"
    }
}