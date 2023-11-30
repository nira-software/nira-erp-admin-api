
package nira.erp.core.infrastructure.persistence;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class CompanyGlobalConfigId implements Serializable {
    public UUID companyId;
    public UUID globalConfigId;

    // Constructores, getters y setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyGlobalConfigId that = (CompanyGlobalConfigId) o;
        return Objects.equals(companyId, that.companyId) &&
                Objects.equals(globalConfigId, that.globalConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, globalConfigId);
    }
}

