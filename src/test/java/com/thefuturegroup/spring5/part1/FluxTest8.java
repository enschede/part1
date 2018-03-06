package com.thefuturegroup.spring5.part1;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;
import reactor.util.function.Tuple2;

import java.time.Duration;

class FluxTest8 {

    private Flux<Integer> sampleFlux = Flux.just(1, 9, 4, 7, 6, 2, 2, 7, 3, 4, 8);

    // We love TDD
    //
    // Given the flux, write a subscriber based on the Subscriber interface
    @Test
    void fluxAndVerifierTest() {
//        Flux<Integer> sampleFlux = ...
//
//        StepVerifier.create(actualFlux)
//                .expectNext(1, 9, 4, 7, 6, 7, 3, 4, 8)
//                .expectComplete()
//                .verify();
    }

    // We want to subscribe with backpressure to the flux
    //
    // Given the flux, write a subscriber based on the Subscriber interface
    @Test
    void fluxAndSubscriberWithBackpressure() {

//        sampleFlux.subscribe(new Subscriber<Integer>() {
    }

    // We want our flux to notify us on subscribe of a subscriber
    //
    // Given a flux, let the flux execute a println once it is subscribed
    @Test
    void notifyOnSubscribe() {
//        sampleFlux...
    }

    // Given a flux emitting elements, print all elements that are changed compared to previous element in the flux
    @Test
    void distinctFlux() {
//        final Flux<Integer> actual =
    }

    // Create a flux containing a _range_ [10, 11, 12, ... 20]
    // Verify the output
    @Test
    void rangeFlux() {
//        Flux<Integer> linearRangeFlux = ...
//
//        StepVerifier.create(linearRangeFlux)
//                .expectNext(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
//                .verifyComplete();
    }

    // Create a flux containing a list that emits one element per second
    // Send output to console
    @Test
    void intervalFlux() throws InterruptedException {
//        final Flux<Long> interval = ...
//
//        interval.subscribe(System.out::println);
//
//        Thread.sleep(10000L);
    }

    // Given one flux emitting a set of elements and one flux emitting one element per second,
    // combine them emitting the first flux one by one per second
    // Send output to console
    @Test
    void zipFlux() throws InterruptedException {
//        final Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));
//
//        ...
//
//        Thread.sleep(10000L);
    }

    // Calculate the average of the last two element, skipping the first element
    // The Pair class can be used
    // Send output to console
    @Test
    void showAverageOfLastTwoValues() {
//        sampleFlux...
//                .scan(new Pair(0, 0), (pair1, newValue) -> pair1.shift(newValue))
//                .skip(1)
//                .subscribe(p -> System.out.println(p.average()));
    }

    private static class Pair {
        final int first;
        final int last;

        private Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }

        Pair shift(Integer newValue) {
            return new Pair(this.last, newValue);
        }

        public float average() {
            return ((float) (first + last)) / 2.0f;
        }
    }
}
