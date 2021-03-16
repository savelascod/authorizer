package authorization.project.persistence.impl;

import authorization.project.persistence.entity.AccountEntity;
import authorization.project.persistence.repository.IAccountRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Custom implementation of {@link IAccountRepository}, with explicit Data Structures
 *
 * @version 1.0
 * @since 1.0
 */
@Component
public class CustomAccountRepository implements IAccountRepository {

    private List<AccountEntity> accounts = new ArrayList<>();

    private int idCount;

    @Override
    public Optional<AccountEntity> findFirstByIdIsNotNull() {
        Optional<AccountEntity> accountEntity = accounts.isEmpty() ?
                Optional.empty() : Optional.of(accounts.get(0));
        return accountEntity;
    }

    @Override
    public long count() {
        return accounts.size();
    }

    @Override
    public <S extends AccountEntity> S save(S entity) {
        entity.setId(++idCount);
        accounts.add(entity);
        return entity;
    }

    @Override
    public List<AccountEntity> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AccountEntity> findAll(Sort sort) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Page<AccountEntity> findAll(Pageable pageable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<AccountEntity> findAllById(Iterable<Integer> integers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(AccountEntity entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends AccountEntity> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<AccountEntity> findById(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void flush() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteInBatch(Iterable<AccountEntity> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException();
    }

    @Override
    public AccountEntity getOne(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> long count(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends AccountEntity> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException();
    }
}
