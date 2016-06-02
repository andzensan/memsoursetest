import memsourcetest.User


class BootStrap {

    def init = { servletContext ->
		
		//test user
		def testuser = User.list()[0]
		if(!testuser){
			testuser = new User(username:"testuser",password:"newuser1")
			testuser.save(failOnError: true, flush: true)
		}
		
		
    }
    def destroy = {
    }
}
