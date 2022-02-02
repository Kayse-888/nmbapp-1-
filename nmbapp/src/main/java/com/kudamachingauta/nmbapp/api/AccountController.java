package com.kudamachingauta.nmbapp.api;

import com.kudamachingauta.nmbapp.dto.ApiResponse;
import com.kudamachingauta.nmbapp.services.AccountService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/api/v1/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public ApiResponse getAllAccounts(){
        return new ApiResponse(200, "SUCCESS", null);
    }

    @GetMapping("/{id}")
    public ApiResponse getOneAccount(@PathVariable("id") Long id){
       return new ApiResponse(200, "SUCCESS", null);
    }

    @GetMapping("/acc-number")
    public ApiResponse getByAccountNumber(@RequestParam("account_number") String accountNumber){
        return new ApiResponse(200, "SUCCESS", null);
    }
}
