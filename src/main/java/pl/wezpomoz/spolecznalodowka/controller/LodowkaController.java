package pl.wezpomoz.spolecznalodowka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wezpomoz.spolecznalodowka.model.LodowkaList;
import pl.wezpomoz.spolecznalodowka.service.LodowkaService;

@RestController
@RequestMapping("/v1/lodowki")
@RequiredArgsConstructor
public class LodowkaController {

    private final LodowkaService lodowkaService;

    @GetMapping
    public LodowkaList getLodowki() {
        return new LodowkaList(lodowkaService.getAll());
    }
}
