package com.example.todolist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tacheService")
public class TacheService  {
    @Autowired
    private TacheRepository tacheRepository;

    public List<Taches> findByUser(long id) {
        return tacheRepository.findByUser(id);
    }

    public void create(Taches taches){
        tacheRepository.save(taches);
    }

    public void delete(long id){
        tacheRepository.delete(tacheRepository.findById(id).get());
    }
}
