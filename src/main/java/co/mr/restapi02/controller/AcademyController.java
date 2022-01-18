package co.mr.restapi02.controller;

import co.mr.restapi02.mapper.AcademyMapper;
import co.mr.restapi02.model.Academy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/academy")
public class AcademyController {

    @Autowired
    private AcademyMapper academyMapper;

    @PostMapping("")
    // 파라미터를 requstBody로 전달하도록 설정
    public int post(@RequestBody Academy academy) {
        return academyMapper.insert(academy);
    }

    @GetMapping("")
    public List<Academy> getAcademies() {
        return academyMapper.getAcademies();
    }

}
