node{
    stage("拉取代码"){
checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], extensions: [], userRemoteConfigs: [[credentialsId: '6f1dcce6-38c8-448c-ab68-4d48732820b5', url: 'git@github.com:HangStarLi/cloud.git']]])
    }

}