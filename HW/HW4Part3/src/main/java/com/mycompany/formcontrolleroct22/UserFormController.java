/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formcontrolleroct22;

import com.mycompany.pojo.User;
import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author jumin
 */
public class UserFormController extends SimpleFormController {
    
    public UserFormController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(User.class);
        setCommandName("user");
        setSuccessView("user-success");
        setFormView("user-form");
    }
    
    
    
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
       // User user = (User) command;
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
//    protected ModelAndView onSubmit(
//            HttpServletRequest request, 
//            HttpServletResponse response, 
//            Object command, 
//            BindException errors) throws Exception {
//        ModelAndView mv = new ModelAndView(getSuccessView());
//        //Do something...
//        return mv;
//    }
     
}
