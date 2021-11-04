package cz.metacentrum.perun.integration.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import cz.metacentrum.perun.core.api.MemberGroupStatus;
import cz.metacentrum.perun.core.api.MembershipType;

public record GroupMemberRelation(
	@JsonGetter("g")  int groupId,
	@JsonGetter("m")  int memberId,
	@JsonGetter("sg") int sourceGroupId,
	@JsonGetter("s")  MemberGroupStatus sourceGroupStatus,
	@JsonGetter("t")  MembershipType membershipType
) {
}
