package pl.java.scalatech.behave.replaceMethod;

import lombok.extern.slf4j.Slf4j;
import pl.java.scalatech.scopeBehave.Call;

@Slf4j
public abstract class MyService implements Service {

    private final Call customerRepo;

    public MyService(Call customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public abstract Call getCurrencyRepo();

    @Override
    public void doSomethingWithItemRepo() {
        Call repo = getCurrencyRepo();
        log.info("+++ doSomethingWithRepo... start");
        repo.print(log, repo);

        log.info("+++ doSomethingWithRepo... end");

    }

    @Override
    public Call getCustomerRepo() {
        return customerRepo;
    }

}
