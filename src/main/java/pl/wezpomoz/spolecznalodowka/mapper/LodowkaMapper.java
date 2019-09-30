package pl.wezpomoz.spolecznalodowka.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pl.wezpomoz.spolecznalodowka.model.Lodowka;
import pl.wezpomoz.spolecznalodowka.model.LodowkaDTO;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class LodowkaMapper {
    private final ModelMapper modelMapper;

    public List<LodowkaDTO> mapToLodowkaListDTO(final List<Lodowka> lodowkaList) {
        return lodowkaList.stream().map(this::mapToLodowkaDTO).collect(Collectors.toList());
    }

    private LodowkaDTO mapToLodowkaDTO(final Lodowka lodowka) {
        return modelMapper.map(lodowka, LodowkaDTO.class);
    }
}
