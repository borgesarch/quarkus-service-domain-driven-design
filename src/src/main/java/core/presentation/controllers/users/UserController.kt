package core.presentation.controllers.users

import core.application.core.users.IUserService
import core.domain.core.IUserRepository
import core.domain.core.users.User
import javax.inject.Inject
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.Response

@Path("/api/users")
class UserController(
    @Inject internal var userService: IUserService? = null,
    @Inject internal var userRepository: IUserRepository? = null
) {

    @GET
    fun findAll() : Response
        = Response.ok(userService?.findAll()).build()

    @GET
    @Path("/{id}")
    fun findById(@PathParam("id") id : String) :Response
        = Response.ok(userRepository?.find("id", id)?.firstResult()).build()

    @POST
    @Transactional fun persist(user: User?): Response
        = Response.ok(user?.let { userRepository?.persist(it) }).build()

    @PUT
    @Path("/{id}")
    @Transactional
    fun update(@PathParam("id") id : String, user: User?): Response
        = Response.ok(user?.let { userRepository?.update("id", id, it) }).build()
}