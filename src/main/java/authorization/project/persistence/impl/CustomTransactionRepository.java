package authorization.project.persistence.impl;

import authorization.project.persistence.entity.TransactionEntity;
import authorization.project.persistence.repository.ITransactionRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Custom implementation of {@link ITransactionRepository}, with explicit Data Structures
 *
 * @version 1.0
 * @since 1.0
 */
@Component
public class CustomTransactionRepository implements ITransactionRepository {

    private List<TransactionEntity> transactions = new ArrayList<>();

    private int idCount;

    @Override
    public List<TransactionEntity> findAllByDateLessThanEqualAndDateGreaterThanEqual
            (OffsetDateTime endDateTime, OffsetDateTime startDateTime) {
        return transactions.stream().filter(transactionEntity ->
                !(transactionEntity.getDate().isAfter(endDateTime) ||
                        transactionEntity.getDate().isBefore(startDateTime)))
                .collect(Collectors.toList());
    }

    @Override
    public List<TransactionEntity> findAllByAmountEqualsAndMerchantNameEquals
            (Integer amount, String merchantName) {
        return transactions.stream().filter(transactionEntity ->
                transactionEntity.getAmount().equals(amount) &&
                        transactionEntity.getMerchantName().equals(merchantName))
                .collect(Collectors.toList());
    }

    @Override
    public <S extends TransactionEntity> S save(S entity) {
        entity.setId(++idCount);
        transactions.add(entity);
        return entity;
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TransactionEntity> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TransactionEntity> findAll(Sort sort) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Page<TransactionEntity> findAll(Pageable pageable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TransactionEntity> findAllById(Iterable<Integer> integers) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(TransactionEntity entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends TransactionEntity> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> List<S> saveAll(Iterable<S> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Optional<TransactionEntity> findById(Integer integer) {
        return Optional.empty();
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
    public <S extends TransactionEntity> S saveAndFlush(S entity) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteInBatch(Iterable<TransactionEntity> entities) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAllInBatch() {
        throw new UnsupportedOperationException();
    }

    @Override
    public TransactionEntity getOne(Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> Optional<S> findOne(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> List<S> findAll(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> List<S> findAll(Example<S> example, Sort sort) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> long count(Example<S> example) {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends TransactionEntity> boolean exists(Example<S> example) {
        throw new UnsupportedOperationException();
    }
}
