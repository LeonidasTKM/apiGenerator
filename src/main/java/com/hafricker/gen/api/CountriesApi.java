/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.hafricker.gen.api;

import com.hafricker.gen.dto.Country;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-31T22:46:55.341766800+02:00[Europe/Paris]")
@Validated
@Api(value = "countries", description = "the countries API")
public interface CountriesApi {

    /**
     * GET /countries
     * Get countries within iban validator
     *
     * @return A list of Country. (status code 200)
     */
    @ApiOperation(value = "", nickname = "getCountries", notes = "Get countries within iban validator", response = Country.class, responseContainer = "List", tags={ "CountryApi", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of Country.", response = Country.class, responseContainer = "List") })
    @GetMapping(
        value = "/countries",
        produces = { "application/json" }
    )
    ResponseEntity<List<Country>> getCountries();

}
