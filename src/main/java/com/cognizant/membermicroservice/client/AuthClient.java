package com.cognizant.membermicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.membermicroservice.model.AuthenticationResponse;

/**
 * 
 *
 * This class communicates with JwtAuthentication microservice to verify the
 * token. using Feign client With provided URL and name of microservice it
 * interact with that microservice.
 *
 */

@FeignClient(name = "authenticationFeignClient", url = "${AUTH_SERVICE:http://Pod3ij033authservice-env.eba-e66cgrtc.ap-south-1.elasticbeanstalk.com}")
public interface AuthClient {

	@GetMapping("/authorization/validate")
	public AuthenticationResponse getValidity(@RequestHeader(name="Authorization") String token);
}
