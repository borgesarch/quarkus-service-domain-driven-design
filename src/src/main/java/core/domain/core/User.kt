package core.domain.core

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id


@Entity(name = "users")
class User  {
    @Id val id: UUID = UUID.randomUUID();
    @Column(name = "name") val name: String = ""
}