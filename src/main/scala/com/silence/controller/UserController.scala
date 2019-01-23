package com.silence.controller

import java.util.List

import com.silence.enties.User
import com.silence.service.UserService
import io.swagger.annotations.{Api, ApiOperation}
import javax.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.domain.Page
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._

@ComponentScan
@Controller
@ResponseBody
@Api(value = "Sample", description = "范例相关接口",produces = MediaType.ALL_VALUE)
class UserController @Autowired()(private val userService : UserService){

    //restful接口示例
    @ApiOperation("列表")
    @RequestMapping(value = Array("/list"), method = Array(RequestMethod.GET))
    def list() : List[User] = {
        userService.findAll
    }
    
    @RequestMapping(value = Array("save"), method = Array(RequestMethod.POST))
    def save(@Valid user : User) : User = {
        userService.save(user)
    }
    
  	@RequestMapping(value = Array("/find/{id}"), method = Array(RequestMethod.GET))
    def find(@PathVariable(value = "id") id: Long) : User = {
        userService.find(id)
    }
    
    @RequestMapping(value = Array("delete/{id}"), method = Array(RequestMethod.POST))
    def delete(@PathVariable(value = "id") id: Long) : Unit = {
        userService.delete(id)
    }
    
    @RequestMapping(value = Array("update"), method = Array(RequestMethod.POST))
    def update(@Valid user : User, bindingResult : BindingResult) : User = {
        userService.update(user)
    }
    
    @RequestMapping(value = Array("page"), method = Array(RequestMethod.GET))
    def page(@RequestParam("page") page : Int, @RequestParam("pageSize") pageSize : Int) : Page[User] = {
        userService.page(page, pageSize)
    }
    
}

