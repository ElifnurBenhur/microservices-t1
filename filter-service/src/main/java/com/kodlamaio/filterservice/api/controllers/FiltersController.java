package com.kodlamaio.filterservice.api.controllers;

import com.kodlamaio.filterservice.business.abstracts.FilterService;
import com.kodlamaio.filterservice.business.dto.responses.GetAllFiltersResponse;
import com.kodlamaio.filterservice.business.dto.responses.GetFilterResponse;
import com.kodlamaio.filterservice.entities.Filter;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/filters")
public class FiltersController {
    private final FilterService service;

  /*  Sadece ilk çalıştırmada lazım çünkü mongodb otomatik oluşturmuyor tabloyu,
   @PostConstruct
    public void createdb(){
        System.err.println("!!! MONGO DB OLUSTU!!!");
        System.err.println("!!! MONGO DB OLUSTU!!!");
        System.err.println("!!! MONGO DB OLUSTU!!!");
        System.err.println("!!! MONGO DB OLUSTU!!!");
        service.add(new Filter());
    }
    */

    @GetMapping
    public List<GetAllFiltersResponse> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public GetFilterResponse getAll(@PathVariable UUID id){
        return service.getById(id);
    }
}
