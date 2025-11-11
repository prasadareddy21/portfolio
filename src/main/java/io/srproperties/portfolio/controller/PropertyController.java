package io.srproperties.portfolio.controller;

import io.srproperties.portfolio.model.Property;
import io.srproperties.portfolio.repository.PropertyRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.StreamSupport;

@RequestMapping("/property")
@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor_ = @__(@Autowired))
public class PropertyController {

    private final PropertyRepo propertyRepo;

    @GetMapping("/list")
    public ResponseEntity<List<Property>> list(){
        Iterable<Property> propertyIterable = propertyRepo.findAll();
        List<Property> result = StreamSupport.stream(propertyIterable.spliterator(), false).toList();
        return result.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(result);
    }

    @PostMapping("/save")
    public ResponseEntity<Property> save(@RequestBody Property property){
        return ResponseEntity.ok(propertyRepo.save(property));
    }

    @GetMapping("/get")
    public ResponseEntity<Property> get(@RequestParam Long id){
        return propertyRepo.findById(id).map(ResponseEntity::ok).orElseGet(ResponseEntity.notFound()::build);
    }
}
