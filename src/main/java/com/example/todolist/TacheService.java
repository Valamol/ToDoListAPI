package com.example.todolist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service("tacheService")
public class TacheService implements TacheRepository {
    @Autowired
    private TacheRepository tacheRepository;



    @Override
    public void flush() {
    }

    @Override
    public <S extends Taches> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Taches> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Taches> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Taches getOne(Long aLong) {
        return null;
    }

    @Override
    public Taches getById(Long aLong) {
        return null;
    }

    @Override
    public Taches getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Taches> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Taches> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Taches> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Taches> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Taches> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Taches> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Taches, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Taches> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Taches> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Taches> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Taches> findAll() {
        return null;
    }

    @Override
    public List<Taches> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Taches entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Taches> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Taches> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Taches> findAll(Pageable pageable) {
        return null;
    }


    @Override
    public List<Taches> findByUser(String user) {
        return null;
    }
}
