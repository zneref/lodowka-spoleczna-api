package pl.wezpomoz.spolecznalodowka.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.wezpomoz.spolecznalodowka.mapper.LodowkaMapper;
import pl.wezpomoz.spolecznalodowka.model.Lodowka;
import pl.wezpomoz.spolecznalodowka.model.LodowkaDTO;
import pl.wezpomoz.spolecznalodowka.repository.LodowkaRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LodowkaService {
    private final LodowkaRepository lodowkaRepository;
    private final LodowkaMapper lodowkaMapper;

    public List<LodowkaDTO> getAll() {
        List<Lodowka> lodowkaList = lodowkaRepository.findAll();
        if(lodowkaList.isEmpty()) {
            return new ArrayList<>();
        }
        else {
            return lodowkaMapper.mapToLodowkaListDTO(lodowkaList);
        }
    }
}
