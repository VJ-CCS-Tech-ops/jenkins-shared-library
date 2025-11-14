import groovyjarjarpicocli.CommandLine

def call() {
    node {
        sh '''
            git version 
            '''
    }
}