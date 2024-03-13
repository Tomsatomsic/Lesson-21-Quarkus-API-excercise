package cz.spsmb.dao;
import cz.spsmb.model.Kind;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

    @ApplicationScoped
    public class KindRepository implements PanacheRepository<Kind> {

        public Optional<Kind> listByName(String name){
            return find("name", name).singleResultOptional();
        }
    }




