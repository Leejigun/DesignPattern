package com.example.robinhood.designpattern.domain.exercise.warmup;

import android.util.Log;

import com.example.robinhood.designpattern.domain.exercise.Exercise;

/**
 *
 *
 ​정적스트레칭이란 ROM을 향상 시키면서 느리고 지속적인 근육의 신장을 유지하는 것으로
 보통 15-30초 정도 합니다.
 정적스트레칭의 장점은 탄성스트레칭이나 동적 스트레칭에 비해 안전하고 쉽다는 점과
 파트너가 불필요하며 힘조절에 용이하고 가소효과가 있습니다.그리고 신장반사를 억제합니다.​
 ​ 단점으로는 정적 스트레칭 자체는 부상 위험성이 낮으나
 격렬한 스포츠 활동 전에 하는 것은 운동의 수행력과 부상예방에 부정적인 영향이 있을 수 있습니다.
 그리고 다른 스트레칭에 비해 시간이 오래 걸리고 주동근력에 의해 제한된다는 단점이 있습니다.
 * Created by sean on 2017. 7. 9..
 *
 */

public class StaticStretching extends Exercise {
    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! Static Stretching");
    }
}
