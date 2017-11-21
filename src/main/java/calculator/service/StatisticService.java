package calculator.service;

import calculator.domain.Operation;

public interface StatisticService {
    ////Increase statistic by operation option
    void increase(Operation operation);
    //Get statistic by operation option
    int getStatistic(Operation operation);
}
