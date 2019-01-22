package com.silence.enties

import java.util.Date

import javax.persistence.{Entity, GeneratedValue, Id, Table,Column}
import javax.validation.constraints.NotNull
import org.hibernate.validator.constraints.{NotBlank, NotEmpty}
import org.springframework.format.annotation.DateTimeFormat

import scala.beans.BeanProperty

@Table(name = "users")
@Entity
class User {

    @Id
    @GeneratedValue
    @BeanProperty
    var id: Long = _
    
    @BeanProperty
    @NotBlank
    var name: String = _
    
    @BeanProperty
    @NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
    var birthday: Date = _
    
    @BeanProperty
    @NotEmpty
    @Column(name="telephone")
    var telephone: String = _
    
    override def toString = "id = " + id + ",name = " + name + ",birthday = " + birthday + ",telephone = " + telephone
    
}