/**
 * 
 */
$(document).ready(function() {
	
	$.validator.setDefaults({
		errorClass: "invalid-feedback",
		highlight: function(element){
			$(element)
				.closest('.form-control')
				.addClass('is-invalid')
		},
		unhighlight: function(element){
			$(element)
				.closest('.form-control')
				.removeClass('is-invalid')
		}
	})
	
	$.validator.addMethod("customEmail", function (value, element) {
    return this.optional(element) || /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(value);
	}, "Please enter valid email address!");
	
	$("#regForm").validate({
		
		rules: {
	        firstName: {
	          required: true,
	          normalizer: function(value) {
					  return $.trim(value);
				    }
	        },
	        lastName: {
	          required: true,
	          normalizer: function(value) {
					  return $.trim(value);
				    }
	        },
	        country: {
	          required: true
	        },
	        city: {
	          required: true
	        },
	        phone: {
	          required: true,
	        },
	        email: {
	          required: true,
	          customEmail: true
	        },
	        pass: {
	          required: true,
	          minlength: 6,
	          maxlength: 25,
	          normalizer: function(value) {
					  return $.trim(value);
				    }
	        },
	        pass2: {
	            required: true,
	            equalTo: '#password'
	          },
	      },
	      messages: {
	        firstName: {
	          required: 'First name is empty'
	        },
	        lastName: {
	          required: 'Last name is empty'
	        },
	        country: {
	          required: 'Country is empty'
	        },
	        city: {
	          required: 'City is empty'
	        },
	        phone: {
	          required: 'Phone number is required'
	        },
	        email: {
	          required: 'Email is required'
	        },
	        pass: {
	          required: 'Password is required'
	        },
	        pass2: {
	            required: 'Confirm password is required',
	            equalTo: 'Password did not match, Please enter the same password'
	          }
	      }
	})
})
