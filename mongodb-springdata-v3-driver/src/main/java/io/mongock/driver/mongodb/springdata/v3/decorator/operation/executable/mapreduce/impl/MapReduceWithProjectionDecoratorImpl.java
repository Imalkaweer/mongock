package io.mongock.driver.mongodb.springdata.v3.decorator.operation.executable.mapreduce.impl;

import io.mongock.driver.api.lock.guard.invoker.LockGuardInvoker;
import io.mongock.driver.mongodb.springdata.v3.decorator.operation.executable.mapreduce.MapReduceWithProjectionDecorator;
import org.springframework.data.mongodb.core.ExecutableMapReduceOperation;

public class MapReduceWithProjectionDecoratorImpl<T> implements MapReduceWithProjectionDecorator<T> {

    private final ExecutableMapReduceOperation.MapReduceWithProjection<T> impl;
    private final LockGuardInvoker invoker;

    public MapReduceWithProjectionDecoratorImpl(ExecutableMapReduceOperation.MapReduceWithProjection<T> impl, LockGuardInvoker lockGuardInvoker)  {
        this.impl = impl;
        this.invoker = lockGuardInvoker;
    }
    @Override
    public LockGuardInvoker getInvoker() {
        return invoker;
    }

    @Override
    public ExecutableMapReduceOperation.MapReduceWithProjection<T> getImpl() {
        return impl;
    }
}