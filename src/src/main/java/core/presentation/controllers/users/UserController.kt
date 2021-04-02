package core.presentation.controllers.users

import core.application.core.users.IUserService
import core.domain.core.User
import core.infrastructure.repositories.users.UserRepository
import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response

@Path("/api/users")
class UserController(
    @Inject internal var userService: IUserService? = null,
    @Inject internal var userRepository: UserRepository? = null
) {

    @GET
    fun findAll() : Response
        = Response.ok(userService?.findAll()).build()

    @GET @Path("/{id}")
    fun findById(@PathParam("id") id : String) :Response
        = Response.ok(userRepository?.find("id", id)
            ?.firstResult()).build()

    @POST @Transactional
    fun create(user: User?): Response
        = Response.ok(user?.let { userRepository?.persist(it) }).build()
}