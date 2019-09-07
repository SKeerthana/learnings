import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class ReactiveJavaPractice {

    public static void main(String[] args) {

        Observable<String> coldObservable = Observable.just("first", "second", "third");
        ConnectableObservable<String> hotObservable = coldObservable.publish();

        coldObservable.subscribe(message -> System.out.println("cold observer 1 " + message));
        coldObservable.subscribe(message -> System.out.println("cold observer 2 " + message));

        hotObservable.subscribe(message -> System.out.println("hot observer 1 " + message));
        hotObservable.subscribe(message -> System.out.println("hot observer 2 " + message));
        hotObservable.connect();

    }
}
