package core.ism.dependance.Data.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NiveauClasse {
    L1(1),
    L2(2),
    L3(3),
    M1(4),
    M2(5);

    private final long index;
}
