package calculator.service;

import calculator.domain.Operation;


import java.util.HashMap;
import java.util.Map;

public class StatisticServiceImpl implements StatisticService {

    private Map<Operation, Integer> statistics = new HashMap<>();


    public void increase(Operation operation) {
        int count = getStatistic(operation);
        statistics.put(operation, ++count);
    }

    public int getStatistic(Operation operation) {
        Integer count = statistics.get(operation);
        if (count == null) {
            return  0;
        }
        return count;
    }

}
