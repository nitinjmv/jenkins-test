def buildApp(){
  echo 'building app'
}

def testApp(){
  echo 'testing app'
}

def deployApp(){
  echo 'deploying app'
  echo 'deploying version ${params.VERSION}'
}
return this
