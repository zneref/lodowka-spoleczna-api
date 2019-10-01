package pl.wezpomoz.spolecznalodowka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wezpomoz.spolecznalodowka.model.LodowkaDTO;
import pl.wezpomoz.spolecznalodowka.response.LodowkaResponse;
import pl.wezpomoz.spolecznalodowka.service.LodowkaService;

import java.util.List;

@RestController
@RequestMapping("/v1/lodowki")
@RequiredArgsConstructor
public class LodowkaController {

    private final LodowkaService lodowkaService;

    @GetMapping
    public LodowkaResponse getLodowki() {
        return new LodowkaResponse(lodowkaService.getAll());
    }
}
