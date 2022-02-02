package com.kudamachingauta.nmbapp.api;

import com.kudamachingauta.nmbapp.services.BranchService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/branches", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/api/v1/branches", produces = MediaType.APPLICATION_JSON_VALUE)
public class BranchController {

    @Autowired
    private BranchService branchService;
}
