package calculator.service;

import calculator.domain.Operation;

public interface StatisticService {
    void increase(Operation operation);
    int getStatistic(Operation operation);
}
