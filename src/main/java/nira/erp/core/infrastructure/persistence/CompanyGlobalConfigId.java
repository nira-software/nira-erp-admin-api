
package nira.erp.core.infrastructure.persistence;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Data
public class CompanyGlobalConfigId implements Serializable {
    private UUID companyId;
    private UUID globalConfigId;

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

