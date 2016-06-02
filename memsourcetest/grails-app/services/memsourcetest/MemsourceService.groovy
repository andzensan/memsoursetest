package memsourcetest


import org.codehaus.groovy.grails.commons.GrailsApplication
import grails.converters.JSON



import grails.transaction.Transactional

@Transactional
class MemsourceService {

	GrailsApplication grailsApplication
	User updateUser(String username, String password) {

		def userInstance = User.list()[0]
		// Check for existance
		if(!userInstance){
			return null
		}

		userInstance.username = username
		userInstance.password = password

		userInstance.save()

		return userInstance
	}
	User getUser(){
		def userInstance = User.list()[0]
		return userInstance
	}

	//login method

	String login(){
		String url = grailsApplication.config.memsource.api.url
		User user = User.list()[0]
		def loginRequest = (url+"/auth/login?userName="+user.username+"&password="+user.password)
		def loginResponse

		try{
			loginResponse = loginRequest.toURL().text //sending login request
		}catch(Exception e){
			log.error(e)
			return null
		}
		return JSON.parse(loginResponse).token
	}

	
	String projectsList(){

		String url = grailsApplication.config.memsource.api.url
		def token = login()
		def loginRequest = (url+"/project/list?token="+token)
		def loginResponse

		try{
			loginResponse = loginRequest.toURL().text //sending login request
		}catch(Exception e){
			log.error(e)
		}
		return loginResponse
	}
}
