/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validation(){


var reg_Email=/^([a-z A-Z 0-9 \. \_]+)@([a-z 0-9]+).([a-z]{2,8})(.[a-z] {2,8})?$/;
var reg_pass=/^[A-Z a-z 0-9]{6}$/;



var unametag = document.forms["myform"]["uname"];
var passtag = document.forms["myform"]["pass"];
var res_reg_uname=reg_Email.test(unametag.value);
var res_reg_pass= reg_pass.test(passtag.value);


if(unametag.value == passtag.value){
    alert("username and password cannot be same");
    unametag.focus();
    passtag.focus();
    return false;
}
if(unametag.value.trim()== ""){ 
			alert("Empty Username not allowed");
			unametag.style.border = 'solid 3px red';
			document.getElementById("lbl1").style.visibility  = 'visible';
                        return false;

}

if(passtag.value.trim()== ""){
				alert("blank password not allowed");
				passtag.style.border = 'solid 3px red';
				document.getElementById("lbl2").style.visibility  = 'visible';
                                return false;
 }		
if(passtag.value.length > 6){
				alert("password should be 6 char long");
				passtag.style.border = 'solid 3px red';
				document.getElementById("lbl2").style.visibility  = 'visible';
                                return false;
 }	
 if(passtag.value.length < 6){
				alert(" too short password it should be 6 char long");
				passtag.style.border = 'solid 3px red';
				document.getElementById("lbl2").style.visibility  = 'visible';
                                return false;
 }		

if(res_reg_uname == false){
    alert("Invalid Email");
                unametag.style.border = 'solid 3px red';
                
                 return false;

			}
if(res_reg_pass == false){
     alert("Invalid Password");
                
                passtag.style.border = 'solid 3px red';
                 return false;

			}

	

return true;

}