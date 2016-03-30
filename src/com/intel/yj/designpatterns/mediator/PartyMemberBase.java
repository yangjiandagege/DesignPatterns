package com.intel.yj.designpatterns.mediator;

import com.intel.yj.designpatterns.Result;

/**
 * 
 * Abstract base class for party members.
 *
 */
public abstract class PartyMemberBase implements PartyMember {

	protected Party party;

	@Override
	public void joinedParty(Party party) {
		Result.append(this + " joins the party");
		this.party = party;
	}

	@Override
	public void partyAction(Action action) {
		Result.append(this + " " + action.getDescription());
	}

	@Override
	public void act(Action action) {
		if (party != null) {
			Result.append(this + " " + action.toString());
			party.act(this, action);
		}
	}

	@Override
	public abstract String toString();

}

