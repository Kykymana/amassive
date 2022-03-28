package ru.myitschool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Result{
    int id, res;

    public Result(int id, int res){
        this.id = id;
        this.res = res;
    }

    @Override
    public String toString() {
        return id + " " + res;
    }
}

class ResultComparator implements Comparator<Result>{

    @Override
    public int compare(Result r1, Result r2) {
        if (r1.res != r2.res) return r2.res - r1.res;
        else if (r1.id != r2.id) return r1.id - r2.id;
        return 0;
    }
}

public class OlympSort {
    public static void main(String[] args) {
        ArrayList<Result> results = new ArrayList<>();
        Collections.sort(results, new ResultComparator());
        for (Result r : results){
            results.toString();
        }
    }
}
