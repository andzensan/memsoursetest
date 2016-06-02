package memsourcetest

class UserController {

	def memsourceService

	def index() {
		def userInstance = memsourceService.getUser()
		respond userInstance
	}

	def update(String username, String password) {

		def userInstance = memsourceService.updateUser(username,password)

		def message = (!userInstance.hasErrors())?"Updated!":null

		render view:"index", model:[userInstance:userInstance, message:message]
	}
}
