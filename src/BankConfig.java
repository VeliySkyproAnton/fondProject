import java.util.List;

@Configuration
public class fondConfig {
    @Bean
    CommandLineRuner commandLineRuner(ServiceRepository repository){
        return args -> {
new Service(
        id: 1L
                    name: "order"
                            date: "11.11.2024"
                                            LocalDate.of(2024, Month.November, 11),
                                                    type: "Ипотека"
);

            new Service(
                    id: 1L
            name: "customer"
            date: "11.11.2024"
            LocalDate.of(2024, Month.November, 11),
                    type: "Илья"
);

            new Service(
                    id: 1L
            name: "status"
            date: "11.11.2024"
            LocalDate.of(2024, Month.November, 11),
                    type: "Оформление"
);

            repository.saveAll(
                    List.of(order, customer, status)
            );
        }
    }
}
