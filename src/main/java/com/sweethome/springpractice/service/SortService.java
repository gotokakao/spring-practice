package com.sweethome.springpractice.service;

import com.sweethome.springpractice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> list){
        System.out.println("sort = " + sort.getClass().getName());
        return sort.sort(list);
    }
}
