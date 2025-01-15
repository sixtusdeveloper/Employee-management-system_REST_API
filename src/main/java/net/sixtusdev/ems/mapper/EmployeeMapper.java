package net.sixtusdev.ems.mapper;

import net.sixtusdev.ems.dto.EmployeeDto;
import net.sixtusdev.ems.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {

        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail());
    }
}
