def call() {
   withKubeConfig(caCertificate: '', clusterName: '', contextName: '', credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: '') {
    sh "kubectl delete -f https://github.com/Aj7Ay/Youtube-clone-app/blob/main/deployment.yml"
}
}