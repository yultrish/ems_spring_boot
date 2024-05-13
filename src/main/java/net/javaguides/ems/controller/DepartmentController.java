package net.javaguides.ems.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.dto.DepartmentDto;
import net.javaguides.ems.service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/departments")
@AllArgsConstructor
public class DepartmentController {
   private DepartmentService departmentService;

   @PostMapping
    public ResponseEntity<DepartmentDto> createDepartment (@RequestBody DepartmentDto departmentDto){
       DepartmentDto saveDepartment = departmentService.createDepartment(departmentDto);
       return new ResponseEntity<>(saveDepartment, HttpStatus.CREATED);
    }
}
