package core.presentation.controllers.users.tests

import core.domain.core.users.User
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/api/user-consumer")
class UserConsumerController {

    @POST @Path("")
    fun send(user: User) : Response {
        return Response.ok(user).build()
    }
}