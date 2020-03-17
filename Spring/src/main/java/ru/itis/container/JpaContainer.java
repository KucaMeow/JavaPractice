package ru.itis.container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.model.Name;
import ru.itis.repository.NamesCrudRepository;

@Service
public class JpaContainer implements Container {

    @Autowired
    NamesCrudRepository namesRepository;

    public void addName(String name) {
        Name toSave = Name.builder()
                .name(name)
                .build();
        namesRepository.save(toSave);
    }

    public String names() {
        return namesRepository.findAll().toString();
    }
}
