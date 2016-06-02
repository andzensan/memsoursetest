package memsourcetest

import grails.converters.JSON

class ProjectsController {

	def memsourceService
	
    def index() { 
		render view:"index"
	}
	
	def list(){
		
		render memsourceService.projectsList()
		
	}
}
