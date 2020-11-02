job('NodeJS example') {
    scm {
        git('https://github.com/nitinjmv/docker-test.git') {  node -> 
            node / gitConfigName('DSL User jmv')
            node / gitConfigEmail('nitinjmv@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
