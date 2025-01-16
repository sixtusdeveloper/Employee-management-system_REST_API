package net.sixtusdev.ems.service.impl;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import net.sixtusdev.ems.dto.EmployeeDto;
import net.sixtusdev.ems.entity.Employee;
import net.sixtusdev.ems.mapper.EmployeeMapper;
import net.sixtusdev.ems.repository.EmployeeRepository;
import net.sixtusdev.ems.service.EmployeeService;

@Service
@AllArgsConstructor

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

}
